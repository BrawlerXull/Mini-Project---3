package Utils;

import javax.swing.*;
import java.awt.*;

public class Utils {
    public static Color kBackgroundColor = Color.white;

    public static DefaultListModel<String> bookingListModel;
    static {
        bookingListModel = new DefaultListModel<>();
        bookingListModel.addElement("Turf A - 2/3/2023");
        bookingListModel.addElement("Turf B - 3/2/2023");
    }
}
