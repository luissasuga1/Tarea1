import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class REGISTRO1 extends JFrame {

    // Definir los componentes
    private JTextField campo_nombre, campo_apellido, campo_telefono, campo_edad;
    private JComboBox<String> campo_sexo, campo_sangre;
    private JButton guardarPaciente;

    public REGISTRO1() {
        // Configuración del JFrame
        setTitle("REGISTRO");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GroupLayout(getContentPane()));

        // Iniciar componentes
        campo_nombre = new JTextField();
        campo_apellido = new JTextField();
        campo_telefono = new JTextField();
        campo_edad = new JTextField();

        String[] sexos = {"Masculino", "Femenino"};
        campo_sexo = new JComboBox<>(sexos);

        String[] tiposSangre = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
        campo_sangre = new JComboBox<>(tiposSangre);

        guardarPaciente = new JButton("Registrar");

        // Estilo para los campos de texto y botones
        Font font = new Font("Arial", Font.PLAIN, 14);
        campo_nombre.setFont(font);
        campo_apellido.setFont(font);
        campo_telefono.setFont(font);
        campo_edad.setFont(font);
        guardarPaciente.setFont(new Font("Arial", Font.BOLD, 16));

        // Estilo para los bordes
        campo_nombre.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        campo_apellido.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        campo_telefono.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        campo_edad.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        
        // Acción del botón
        guardarPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campo_nombre.getText();
                String apellido = campo_apellido.getText();
                String telefono = campo_telefono.getText();
                String edad = campo_edad.getText();
                String sexo = (String) campo_sexo.getSelectedItem();
                String tipoSangre = (String) campo_sangre.getSelectedItem();
                
                // Aquí puedes agregar la lógica para verificar que no exista un paciente con los mismos datos
                System.out.println("Paciente Registrado:");
                System.out.println("Nombre: " + nombre + " " + apellido);
                System.out.println("Sexo: " + sexo);
                System.out.println("Telefono: " + telefono);
                System.out.println("Edad: " + edad);
                System.out.println("Tipo de Sangre: " + tipoSangre);
            }
        });

        // Layout de los componentes
        GroupLayout layout = (GroupLayout) getContentPane().getLayout();
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(new JLabel("Nombre"))
                .addComponent(new JLabel("Apellido"))
                .addComponent(new JLabel("Sexo"))
                .addComponent(new JLabel("Telefono"))
                .addComponent(new JLabel("Edad"))
                .addComponent(new JLabel("Tipo de Sangre"))
                .addComponent(guardarPaciente))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(campo_nombre)
                .addComponent(campo_apellido)
                .addComponent(campo_sexo)
                .addComponent(campo_telefono)
                .addComponent(campo_edad)
                .addComponent(campo_sangre))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(new JLabel("Nombre"))
                .addComponent(campo_nombre))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(new JLabel("Apellido"))
                .addComponent(campo_apellido))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(new JLabel("Sexo"))
                .addComponent(campo_sexo))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(new JLabel("Telefono"))
                .addComponent(campo_telefono))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(new JLabel("Edad"))
                .addComponent(campo_edad))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(new JLabel("Tipo de Sangre"))
                .addComponent(campo_sangre))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(guardarPaciente))
        );

        // Personalización de colores
        getContentPane().setBackground(new Color(235, 235, 235));
        guardarPaciente.setBackground(new Color(0, 123, 255));
        guardarPaciente.setForeground(Color.WHITE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new REGISTRO1().setVisible(true);
            }
        });
    }
}
