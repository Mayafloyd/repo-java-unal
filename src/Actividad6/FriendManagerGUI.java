package Actividad6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class FriendManagerGUI extends JFrame {
    private ArrayList<String> friendsList;
    private DefaultListModel<String> listModel;
    private JList<String> friendsJList;

    public FriendManagerGUI() {
        friendsList = new ArrayList<>();
        listModel = new DefaultListModel<>();
        friendsJList = new JList<>(listModel);

        // Configurar la interfaz gráfica
        setTitle("Friend Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Botón para agregar un amigo
        JButton addButton = new JButton("Agregar Amigo");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String friendName = JOptionPane.showInputDialog(null, "Ingrese el nombre del amigo:");
                if (friendName != null && !friendName.isEmpty()) {
                    friendsList.add(friendName);
                    listModel.addElement(friendName);
                    saveFriendsToFile();
                }
            }
        });

        // Botón para editar un amigo
        JButton editButton = new JButton("Editar Amigo");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = friendsJList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String currentName = friendsList.get(selectedIndex);
                    String newName = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del amigo:", currentName);
                    if (newName != null && !newName.isEmpty()) {
                        friendsList.set(selectedIndex, newName);
                        listModel.set(selectedIndex, newName);
                        saveFriendsToFile();
                    }
                }
            }
        });

        // Botón para eliminar un amigo
        JButton deleteButton = new JButton("Eliminar Amigo");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = friendsJList.getSelectedIndex();
                if (selectedIndex != -1) {
                    friendsList.remove(selectedIndex);
                    listModel.remove(selectedIndex);
                    saveFriendsToFile();
                }
            }
        });

        // Botón para mostrar todos los amigos
        JButton showAllButton = new JButton("Mostrar Amigos");
        showAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (String friend : friendsList) {
                    sb.append(friend).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString(), "Amigos", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Agregar los botones al panel
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(showAllButton);

        // Agregar el panel de botones y la lista de amigos a la ventana
        add(buttonPanel, BorderLayout.NORTH);
        add(new JScrollPane(friendsJList), BorderLayout.CENTER);

        // Cargar amigos desde el archivo al iniciar la aplicación
        loadFriendsFromFile();

        // Configurar la ventana
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true);
    }

    private void loadFriendsFromFile() {
        try {
            File file = new File("friendsContact.txt");
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    friendsList.add(line);
                    listModel.addElement(line);
                }
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveFriendsToFile() {
        try {
            File file = new File("friendsContact.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String friendName : friendsList) {
                writer.write(friendName + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FriendManagerGUI();
            }
        });
    }
}
