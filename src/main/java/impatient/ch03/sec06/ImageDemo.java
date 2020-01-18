/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 6 Processing Lambda Expressions
 * Implementing Your Own Functional Interfaces
 */
package impatient.ch03.sec06;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;

/**
 *
 * @author emaphis
 */
public class ImageDemo {

   static BufferedImage createImage(int width, int height, PixelFunction fn) {
      BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

      for (int x = 0; x < width; x++)
         for (int y = 0; y < height; y++) {
            Color color  = fn.apply(x, y);
            image.setRGB(x, y, color.getRGB());
         }
      return image;
   }

   public static void main(String[] args) throws IOException {
      BufferedImage frenchFlag = createImage(150, 100,
            (x, y) -> x < 50 ? Color.BLUE : x < 100 ? Color.WHITE : Color.RED);

      Path path = Paths.get("resources//flag.png");
      ImageIO.write(frenchFlag, "PNG", path.toFile());
      System.out.println("Image saved to " + path.toAbsolutePath());
   }
}
