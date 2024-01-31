import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Inventory {
     public static void main(String[] args) {
            Inventory swing = new Inventory();
            Dimension d =new Dimension(1640,1000);
            JFrame frame = new JFrame("Inventory");
            frame.setSize(1640, 1000);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.getContentPane().setBackground(Color.BLACK);
            JPanel panel = new JPanel();
            panel.setSize(1640, 1000);
            panel.setLocation(0, 0);
            panel.setBackground(Color.BLACK);
            panel.setLayout(null);
            panel.setVisible(true);
            panel.setFocusable(true);
            frame.add(panel);
            JScrollBar scrollBar = new JScrollBar();
            panel.add(scrollBar);
            scrollBar.setMinimum(0);
            scrollBar.setMaximum(160);
            scrollBar.setSize(1600, 20);
            scrollBar.setLocation(20, 940);
            scrollBar.setVisible(true);
            scrollBar.setOrientation(JScrollBar.HORIZONTAL);
            scrollBar.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
                public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                    scrollBar.setValue(evt.getValue());
                    panel.setLocation(-evt.getValue(), 0);
                }
            });
            panel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
                public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                    if(java.awt.event.MouseWheelEvent.SHIFT_DOWN_MASK == evt.getModifiersEx())
                    scrollBar.setValue(scrollBar.getValue() + evt.getWheelRotation()*10);
                }
            });
            JButton addButton = new JButton("ADD");
            JButton searchButton = new JButton("SEARCH");
            JTextField searchField = new JTextField();
            JTextField nameField = new JTextField();
            JTextField priceField = new JTextField();
            JTextField quantityField = new JTextField();
            JTextField discField = new JTextField();
            JList<Double> priceList = new JList<>();
            JList<Integer> quantityList = new JList<>();
            JList<Double> totalList = new JList<>();
            ArrayList<String> items = new ArrayList<>();
            ArrayList<Double> prices = new ArrayList<>();
            ArrayList<Integer> quantity = new ArrayList<>();
            ArrayList<Double> total = new ArrayList<>();
            JList<String> itemList = new JList<>();
            JButton editButton = new JButton("EDIT");
            nameField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                        swing.add(nameField,items,itemList,priceField,prices,priceList,quantityField,quantity,quantityList,discField,total,totalList);
                    }
                }
            });
            priceField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                        swing.add(nameField,items,itemList,priceField,prices,priceList,quantityField,quantity,quantityList,discField,total,totalList);
                    }
                }
            });
            quantityField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                        swing.add(nameField,items,itemList,priceField,prices,priceList,quantityField,quantity,quantityList,discField,total,totalList);
                    }
                }
            });
            discField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                        swing.add(nameField,items,itemList,priceField,prices,priceList,quantityField,quantity,quantityList,discField,total,totalList);
                    }
                }
            });
            addButton.setFont(new java.awt.Font("Calibri(Heading)", 3, 20));
            addButton.setHorizontalTextPosition(2);
            addButton.setSize(160, 50);
            addButton.setLocation(1100, 80);
            addButton.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if(evt.getButton() == java.awt.event.MouseEvent.BUTTON1){
                        swing.add(nameField,items,itemList,priceField,prices,priceList,quantityField,quantity,quantityList,discField,total,totalList);
                    }
                }
            });
            panel.add(addButton);
            JButton deleteButton = new JButton("DELETE");
            deleteButton.setFont(new java.awt.Font("Calibri(Heading)", 3, 20));
            deleteButton.setHorizontalTextPosition(2);
            deleteButton.setSize(160, 50);
            deleteButton.setLocation(1440, 80);
            panel.add(deleteButton);
            searchButton.setFont(new java.awt.Font("Calibri(Heading)", 3, 20));
            searchButton.setHorizontalTextPosition(2);
            searchButton.setSize(180, 50);
            searchButton.setLocation(1420, 20);
            searchButton.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if(evt.getButton() == java.awt.event.MouseEvent.BUTTON1){
                        swing.search(searchField,items,itemList,prices,priceList,quantity,quantityList,total,totalList,nameField,priceField,quantityField,discField);
                    }
                }
            });
            searchField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                        swing.search(searchField,items,itemList,prices,priceList,quantity,quantityList,total,totalList,nameField,priceField,quantityField,discField);
                    }
                }
            });
            panel.add(searchButton);
            editButton.setFont(new java.awt.Font("Calibri(Heading)", 3, 20));
            editButton.setHorizontalTextPosition(2);
            editButton.setSize(160, 50);
            editButton.setLocation(1270, 80);
            panel.add(editButton);
            searchField.setFont(new java.awt.Font("Calibri(Heading)", 3, 18));
            searchField.setSize(1390, 50);
            searchField.setLocation(20, 20);
            searchField.setVisible(true);
            searchField.setForeground(Color.LIGHT_GRAY);
            searchField.setText("SEARCH");
            searchField.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if(searchField.getText().equals("SEARCH"))
                    searchField.setText("");
                    searchField.setForeground(Color.BLACK);
                }
            });
            searchField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt){
                    char c=evt.getKeyChar();
                    if(Character.isLowerCase(c))
                        evt.setKeyChar(Character.toUpperCase(c));
                }});
            panel.add(searchField);
            priceList.setFont(new java.awt.Font("Calibri(Heading)", 3, 18));
            priceList.setSize(150, 800);
            priceList.setLocation(620,140);
            priceList.setVisible(true);
            panel.add(priceList);
            quantityList.setFont(new java.awt.Font("Calibri(Heading)", 3, 18));
            quantityList.setSize(150, 800);
            quantityList.setLocation(780,140);
            quantityList.setVisible(true);
            panel.add(quantityList);
            totalList.setFont(new java.awt.Font("Calibri(Heading)", 3, 18));
            totalList.setSize(150, 800);
            totalList.setLocation(940,140);
            totalList.setVisible(true);
            panel.add(totalList);
            priceField.setFont(new java.awt.Font("Calibri(Heading)", 3, 18));
            priceField.setForeground(Color.LIGHT_GRAY);
            priceField.setSize(150, 50);
            priceField.setLocation(620, 80);
            priceField.setVisible(true);
            priceField.setText("PRICE");
            priceField.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if(priceField.getText().equals("PRICE")){
                        priceField.setText("");
                    }
                    priceField.setForeground(Color.BLACK);
                }
            });
            priceField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt){
                    char c=evt.getKeyChar();
                    if(Character.isLetter(c))
                        priceField.setEditable(false);
                    else
                        priceField.setEditable(true);
                }
            });
            panel.add(priceField);
            quantityField.setFont(new java.awt.Font("Calibri(Heading)", 3, 18));
            quantityField.setSize(150, 50);
            quantityField.setLocation(780, 80);
            quantityField.setVisible(true);
            quantityField.setText("QUANTITY");
            quantityField.setForeground(Color.LIGHT_GRAY);
            quantityField.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if(quantityField.getText().equals("QUANTITY")){
                    quantityField.setText("");
                    }
                    quantityField.setForeground(Color.BLACK);
                }
            });
            quantityField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt){
                    char c=evt.getKeyChar();
                    if(Character.isLetter(c))
                        quantityField.setEditable(false);
                    else
                        quantityField.setEditable(true);
                }
            });
            panel.add(quantityField);
            discField.setFont(new java.awt.Font("Calibri(Heading)", 3, 18));
            discField.setSize(150, 50);
            discField.setLocation(940, 80);
            discField.setVisible(true);
            discField.setText("DISCOUNT");
            discField.setForeground(Color.LIGHT_GRAY);
            discField.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if(discField.getText().equals("DISCOUNT"))
                    discField.setText("");
                    discField.setForeground(Color.BLACK);
                }
            });
            discField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt){
                    char c=evt.getKeyChar();
                    if(Character.isLetter(c))
                        discField.setEditable(false);
                    else
                        discField.setEditable(true);
                }
            });
            panel.add(discField);   
            nameField.setFont(new java.awt.Font("Calibri(Heading)", 3, 18));
            nameField.setSize(590, 50);
            nameField.setLocation(20, 80);
            nameField.setVisible(true);
            nameField.setText("NAME");
            nameField.setForeground(Color.LIGHT_GRAY);
            nameField.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    nameField.setText("");
                    nameField.setForeground(Color.BLACK);
                }
            });
            nameField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt){
                    char c=evt.getKeyChar();
                    if(Character.isLowerCase(c))
                        evt.setKeyChar(Character.toUpperCase(c));
                }
            });
            panel.add(nameField);
            itemList.setFont(new java.awt.Font("Calibri(Heading)", 3, 18));
            itemList.setSize(590, 800);
            itemList.setLocation(20, 140);
            panel.add(itemList);
            deleteButton.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if(evt.getButton() == java.awt.event.MouseEvent.BUTTON1){
                        swing.delete(items,itemList,prices,priceList,quantity,quantityList,total,totalList);
                        nameField.setText("NAME");
                        nameField.setForeground(Color.LIGHT_GRAY);
                        priceField.setText("PRICE");
                        priceField.setForeground(Color.LIGHT_GRAY);
                        quantityField.setText("QUANTITY");
                        quantityField.setForeground(Color.LIGHT_GRAY);
                        discField.setText("DISCOUNT");
                        discField.setForeground(Color.LIGHT_GRAY);
                    }
                }
            });
            itemList.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE) {
                        swing.delete(items,itemList,prices,priceList,quantity,quantityList,total,totalList);
                        nameField.setText("NAME");
                        nameField.setForeground(Color.LIGHT_GRAY);
                        priceField.setText("PRICE");
                        priceField.setForeground(Color.LIGHT_GRAY);
                        quantityField.setText("QUANTITY");
                        quantityField.setForeground(Color.LIGHT_GRAY);
                        discField.setText("DISCOUNT");
                        discField.setForeground(Color.LIGHT_GRAY);
                    }
                }
            });
            editButton.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if(evt.getButton() == java.awt.event.MouseEvent.BUTTON1){
                        swing.edit(nameField,itemList,priceField,prices,priceList,quantityField,quantity,quantityList,discField,total,totalList);
                    }
                }
            });
            itemList.addListSelectionListener(new javax.swing.event.ListSelectionListener(){
                public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    int index = itemList.getSelectedIndex();
                    nameField.setText(itemList.getSelectedValue());
                        nameField.setForeground(Color.BLACK);
                        priceList.setSelectedIndex(index);
                        priceField.setText(priceList.getSelectedValue().toString());
                        priceField.setForeground(Color.BLACK);
                        quantityList.setSelectedIndex(index);
                        quantityField.setText(quantityList.getSelectedValue().toString());
                        quantityField.setForeground(Color.BLACK);
                        discField.setText("0");
                        discField.setForeground(Color.LIGHT_GRAY);
                }
            });
            frame.setVisible(true);
     }
     void add(JTextField nameField, ArrayList<String> items, JList<String> itemList, JTextField priceField, ArrayList<Double> prices, JList<Double> priceList, JTextField quantityField, ArrayList<Integer> quantity, JList<Integer> quantityList, JTextField discField, ArrayList<Double> total, JList<Double> totalList){
        String name = nameField.getText();
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a name");
            return;
        }
        if(priceField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a price");
            return;
        }
        if(!priceField.getText().matches("[0-9]+(\\.[0-9][0-9]?)?")){
            JOptionPane.showMessageDialog(null, "Please enter a valid price");
            return;
        }
        double price = Double.parseDouble(priceField.getText());
        if(quantityField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a quantity");
            return;
        }
        if(!quantityField.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Please enter a valid quantity");
            return;
        }
        int q = Integer.parseInt(quantityField.getText());
        if(discField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a discount");
            return;
        }
        if(!discField.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Please enter a valid discount");
            return;
        }
        double t = price * q-Double.parseDouble(discField.getText())/100.0*price*q;
        if (items.contains(name)) {
            int index = items.indexOf(name);
            prices.set(index, price);
            quantity.set(index, quantity.get(index)+q);
            total.set(index, total.get(index)+t);
        }
        else{
            items.add(name);
            prices.add(price);
            quantity.add(q);
            total.add(t);
        }
        nameField.setText("NAME");
        nameField.setForeground(Color.LIGHT_GRAY);
        itemList.setListData(items.toArray(new String[0]));
        priceField.setText("PRICE");
        priceField.setForeground(Color.LIGHT_GRAY);
        priceList.setListData(prices.toArray(new Double[0]));
        quantityField.setText("QUANTITY");
        quantityField.setForeground(Color.LIGHT_GRAY);
        quantityList.setListData(quantity.toArray(new Integer[0]));
        discField.setText("DISCOUNT");
        discField.setForeground(Color.LIGHT_GRAY);
        totalList.setListData(total.toArray(new Double[0]));
     }
     void delete(ArrayList<String> items, JList<String> itemList,ArrayList<Double> prices, JList<Double> priceList, ArrayList<Integer> quantity, JList<Integer> quantityList, ArrayList<Double> total, JList<Double> totalList){
        int index = itemList.getSelectedIndex();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Please select an item");
            return;
        }
        items.remove(index);
        itemList.setListData(items.toArray(new String[0]));
        prices.remove(index);
        priceList.setListData(prices.toArray(new Double[0]));
        quantity.remove(index);
        quantityList.setListData(quantity.toArray(new Integer[0]));
        total.remove(index);
        totalList.setListData(total.toArray(new Double[0]));
     }
     void search(JTextField searchField, ArrayList<String> items, JList<String> itemList, ArrayList<Double> prices, JList<Double> priceList, ArrayList<Integer> quantity, JList<Integer> quantityList, ArrayList<Double> total, JList<Double> totalList, JTextField nameField, JTextField priceField, JTextField quantityField, JTextField discField){
        ArrayList <String> searchItems = new ArrayList<>();
        ArrayList <Double> searchPrices = new ArrayList<>();
        ArrayList <Integer> searchQuantity = new ArrayList<>();
        ArrayList <Double> searchTotal = new ArrayList<>();
        if(searchField.getText().equals("")){
            itemList.setListData(items.toArray(new String[0]));
            priceList.setListData(prices.toArray(new Double[0]));
            quantityList.setListData(quantity.toArray(new Integer[0]));
            totalList.setListData(total.toArray(new Double[0]));
            nameField.setText("NAME");
            nameField.setForeground(Color.LIGHT_GRAY);
            priceField.setText("PRICE");
            priceField.setForeground(Color.LIGHT_GRAY);
            quantityField.setText("QUANTITY");
            quantityField.setForeground(Color.LIGHT_GRAY);
            discField.setText("DISCOUNT");
            discField.setForeground(Color.LIGHT_GRAY);
            return;
        }       
        String search = searchField.getText();
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).contains(search)){
                searchItems.add(items.get(i));
                searchPrices.add(prices.get(i));
                searchQuantity.add(quantity.get(i));
                searchTotal.add(total.get(i));
            }
        }
        if(searchItems.isEmpty()){
            JOptionPane.showMessageDialog(null, "No results found");
            return;
        }
        else{
        itemList.setListData(searchItems.toArray(new String[0]));
        priceList.setListData(searchPrices.toArray(new Double[0]));
        quantityList.setListData(searchQuantity.toArray(new Integer[0]));
        totalList.setListData(searchTotal.toArray(new Double[0]));
        itemList.setSelectedIndex(0);
        }
    }
    void edit(JTextField nameField, JList<String> itemList, JTextField priceField, ArrayList<Double> prices, JList<Double> priceList, JTextField quantityField, ArrayList<Integer> quantity, JList<Integer> quantityList, JTextField discField, ArrayList<Double> total, JList<Double> totalList){
        int index = itemList.getSelectedIndex();
        if(!priceField.getText().matches("[0-9]+(\\.[0-9][0-9]?)?")){
            JOptionPane.showMessageDialog(null, "Please enter a valid price");
            return;
        }
        double price = Double.parseDouble(priceField.getText());
        if(!quantityField.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Please enter a valid quantity");
            return;
        }
        int q = Integer.parseInt(quantityField.getText());
        if(!discField.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Please enter a valid discount");
            return;
        }
        double t = price * q-Double.parseDouble(discField.getText())/100.0*price*q;
        prices.set(index, price);
        quantity.set(index, q);
        total.set(index, t);
        priceList.setListData(prices.toArray(new Double[0]));
        quantityList.setListData(quantity.toArray(new Integer[0]));
        totalList.setListData(total.toArray(new Double[0]));
        nameField.setText("NAME");
        nameField.setForeground(Color.LIGHT_GRAY);
        priceField.setText("PRICE");
        priceField.setForeground(Color.LIGHT_GRAY);
        quantityField.setText("QUANTITY");
        quantityField.setForeground(Color.LIGHT_GRAY);
        discField.setText("DISCOUNT");
        discField.setForeground(Color.LIGHT_GRAY);
    }
}
