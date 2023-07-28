package ad.univlome.tg.bard;

import javax.swing.*;
import javax.swing.text.Element;
import javax.swing.text.html.ImageView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.view.View;
import android.content.Context;

public class UseIcons extends JFrame {

    // Constructor
    public UseIcons() {
        this.setTitle("Use Icons");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // Nous allons ajouter l'image.
        Icon icon = new Icon(Icons.visibility);
        ImageView imageView = new ImageView((Element) icon);

        this.setVisible(true);
    }
    public static void main(String[] args) {

    }
}
