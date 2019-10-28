package ui;

import business.ContactBusiness;
import entity.ContactEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable tableContacts;
    private JLabel labelContactCount;

    private ContactBusiness mContactBusiness = new ContactBusiness();

    public MainForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setListeners();

        loadContacts();
    }

    private void setListeners() {
        buttonNewContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new ContactForm();
                dispose();
            }
        });

        buttonRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    private void loadContacts() {
        List<ContactEntity> contactList = mContactBusiness.getContacts();
        String[] colunNames = {"Nome","Telefone"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], colunNames);
        contactList.forEach(contact -> {
            Object[] o = new Object[2];

            o[0] = contact.getName();
            o[1] = contact.getPhone();

            model.addRow(o);
        });

        tableContacts.clearSelection();
        tableContacts.setModel(model);

        labelContactCount.setText(mContactBusiness.getContactDescption());
    }

}
