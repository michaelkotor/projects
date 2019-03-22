/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package показкартинок;

import javafx.scene.image.Image;

/**
 *
 * @author milan
 */
public class Images {
    private int i;
    private Image img1;
    private String url1 = "http://3.bp.blogspot.com/-wqyCow3vX18/T7qvtfnQn4I/AAAAAAAAA1U/8lArecKiLM4/s320/meme.png";
    private Image img2;
    private String url2 = "https://chto-eto-takoe.ru/uryaimg/750dee84f4aa22327320ab543c4f5bab.jpg";
    
    public Images(int i) {
        this.i = i;
        if (i == 1) 
        {
            this.img1 = new Image(url1);
        }
        else
        {
            this.img2 = new Image(url1);
            this.img1 = null;
        }
        
    }

    public Image getImg()
    {
        if (this.i == 1) {
            return img1;
        }
        else {
            return img2;
        }
    }
}
