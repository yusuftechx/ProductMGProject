import java.awt.*;
import javax.swing.*;

// Main class for the Product Management Application
public class ProductManagement {
    public static void main(String[] args) {
        // Create and set up the main application frame
        JFrame frame = new JFrame("Product Management Application");
        frame.setSize(400, 400);
        frame.setLayout(null);

        // Create labels
        JLabel titleLabel = createLabel("Product Management", 20, 10, 300, 30, Font.BOLD, 0, Color.BLUE);
        JLabel productIdLabel = createLabel("Product ID:", 16, 30, 60, 100, 30, Font.PLAIN, null);
        JLabel productNameLabel = createLabel("Product Name:", 16, 30, 100, 100, 30, Font.PLAIN, null);
        JLabel productPriceLabel = createLabel("Product Price:", 16, 30, 140, 100, 30, Font.PLAIN, null);
        JLabel productQtyLabel = createLabel("Product Qty:", 16, 30, 180, 100, 30, Font.PLAIN, null);
        JLabel copyrightLabel = createLabel("Copyright © Yusuf Agbeleshola", 16, 110, 310, 300, 30, Font.ITALIC, Color.BLUE);

        // Create text fields
        JTextField productIdField = createTextField(140, 60, 210, 30);
        JTextField productNameField = createTextField(140, 100, 210, 30);
        JTextField productPriceField = createTextField(140, 140, 210, 30);
        JTextField productQtyField = createTextField(140, 180, 210, 30);

        // Create buttons
        JButton addButton = createButton("Add", 30, 230, 100, 30);
        JButton updateButton = createButton("Update", 210, 230, 100, 30);
        JButton deleteButton = createButton("Delete", 30, 270, 100, 30);
        JButton searchButton = createButton("Search", 210, 270, 100, 30);

        // Add components to the frame
        frame.add(titleLabel);
        frame.add(productIdLabel);
        frame.add(productNameLabel);
        frame.add(productPriceLabel);
        frame.add(productQtyLabel);
        frame.add(copyrightLabel);
        frame.add(productIdField);
        frame.add(productNameField);
        frame.add(productPriceField);
        frame.add(productQtyField);
        frame.add(addButton);
        frame.add(updateButton);
        frame.add(deleteButton);
        frame.add(searchButton);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Method to create and configure a JLabel
    private static JLabel createLabel(String text, int fontSize, int x, int y, int width, int height, int style, Color color) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, width, height);
        label.setFont(new Font("Serif", style, fontSize));
        label.setForeground(color);
        return label;
    }

    // Method to create and configure a JTextField
    private static JTextField createTextField(int x, int y, int width, int height) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, width, height);
        return textField;
    }

    // Method to create and configure a JButton
    private static JButton createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        return button;
    }
}
