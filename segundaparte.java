package Aerolinea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class segundaparte  extends JFrame implements ActionListener {


    JLabel nombredeusted,direec,tele,cor,ed,pes,TITAA,BOGOTA,proximovuelos,tusvuelos,nombredeustedlabel,direcelabel,edalabel,correlab,telelabel,pesolabel,ma,fe;
    String pan10;
    JLabel genero1,pesolabelo,edalabelo;

    JButton destino1,VUELOS,VUELOS1,VUELOS2,VUELOS3,VUELOS4,VUELOS5;
    int Entero,enteroedad;

    
    
/**
     *
     */

    public segundaparte(String dato, String dire, String tel, String corre, String eda, String peso, String masculino, String femenino ){
        setLayout(null);  

        Entero=Integer.parseInt(peso);
        enteroedad=Integer.parseInt(eda);

        if(Entero>20){
            
        pesolabelo= new JLabel("Cuando un viajero lleva más de 20 kilos en su equipaje debe pagar $2000 por cada kilo excedido.");
        pesolabelo.setBounds(250,270,450,30);
        pesolabelo.setFont(new Font("arial", Font.BOLD, 9));
        pesolabelo.setForeground(Color.RED);
        add(pesolabelo);
        }


        if(enteroedad<60){
        edalabelo= new JLabel("Debes cancelar por concepto de tarifa aeroportuaria, el 5% del valor del tiquete");
        edalabelo.setBounds(260,220,450,30);
        edalabelo.setFont(new Font("arial", Font.BOLD, 9));
        edalabelo.setForeground(Color.RED);
        add(edalabelo);

        }


        TITAA=new JLabel("     Datos Personales");
        TITAA.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        TITAA.setBounds(0,0,732,40);

        TITAA.setFont(new Font("impact", Font.BOLD, 25));
        TITAA.setForeground(Color.white);;
        add(TITAA);

        VUELOS=new JButton("BOGOTA- CALI");

        VUELOS.setBounds(5,400,200,30);
        VUELOS.setFont(new Font("arial", Font.BOLD, 14));
        add(VUELOS);
        VUELOS.addActionListener(this);



        VUELOS1=new JButton("BOGOTA - MEDELLIN");

        VUELOS1.setBounds(220,400,200,30);
        VUELOS1.setFont(new Font("arial", Font.BOLD, 14));
        add(VUELOS1);
        VUELOS1.addActionListener(this);


        VUELOS2=new JButton("BOGOTA - MANIZALES");

        VUELOS2.setBounds(450,400,200,30);
        VUELOS2.setFont(new Font("arial", Font.BOLD, 14));
        add(VUELOS2);
        VUELOS2.addActionListener(this);


        VUELOS3=new JButton("MANIZALES-BOGOTÁ");

        VUELOS3.setBounds(5,360,200,30);
        VUELOS3.setFont(new Font("arial", Font.BOLD, 14));
        add(VUELOS3);
        VUELOS3.addActionListener(this);

        
        VUELOS4=new JButton("CALI-BOGOTA");

        VUELOS4.setBounds(450,360,200,30);
        VUELOS4.setFont(new Font("arial", Font.BOLD, 14));
        add(VUELOS4);
        VUELOS4.addActionListener(this);

        
        VUELOS5=new JButton("MEDELLIN-BOGOTA");

        VUELOS5.setBounds(220,360,200,30);
        VUELOS5.setFont(new Font("arial", Font.BOLD, 14));
        add(VUELOS5);
        VUELOS5.addActionListener(this);
        

        
        JLabel imag= new JLabel(new ImageIcon("icono.png"));
        imag.setBounds(190,300,256,256);
        add(imag);


        tele= new JLabel(tel);
        tele.setBounds(200,160,120,30);
        add(tele);

        telelabel= new JLabel("Telefono");
        telelabel.setBounds(35,160,120,30);
        telelabel.setFont(new Font("arial", Font.BOLD, 15));

        add(telelabel);

        cor= new JLabel(corre);
        cor.setBounds(200,190,120,30);
        add(cor);


        correlab= new JLabel("Correo electronico:");
        correlab.setBounds(20,190,140,30);
        correlab.setFont(new Font("arial", Font.BOLD, 15));
        add(correlab);


        ed= new JLabel(eda);
        ed.setBounds(200,220,120,30);
        add(ed);

        edalabel= new JLabel("Edad:");
        edalabel.setBounds(37,220,120,30);
        edalabel.setFont(new Font("arial", Font.BOLD, 15));

        add(edalabel);

        pes= new JLabel(peso);
        pes.setBounds(200,270,120,30);
        add(pes);
        

        pesolabel= new JLabel("Peso de Equipaje: ");
        pesolabel.setBounds(20,270,150,30);
        pesolabel.setFont(new Font("arial", Font.BOLD, 15));
        
        ma=new JLabel(masculino);
        ma.setBounds(197,250,150,30);
        add(ma);
        fe=new JLabel(femenino);
        fe.setBounds(197,250,150,30);
        add(fe);

        

        genero1= new JLabel("Genero :");
        genero1.setBounds(35,250,150,30);
        genero1.setFont(new Font("arial", Font.BOLD, 15));

        add(genero1);


        add(pesolabel);
        
        direec= new JLabel(dire);
        
        direec.setBounds(200,90,120,30);
        add(direec);


        direcelabel= new JLabel("Direccion :");
        
        direcelabel.setBounds(35,100,120,30);
        direcelabel.setFont(new Font("arial", Font.BOLD, 15));
        add(direcelabel);

        nombredeusted=new JLabel(dato);
        nombredeusted.setBounds(200,70,220,30);
        add(nombredeusted);

        nombredeustedlabel=new JLabel("Nombre completo:");
        nombredeustedlabel.setBounds(20,70,140,30);
        nombredeustedlabel.setFont(new Font("arial", Font.BOLD, 15));
        add(nombredeustedlabel);



        tusvuelos=new JLabel("Tus Vuelos :");
        tusvuelos.setBounds(35,125,120,30);
        tusvuelos.setFont(new Font("arial", Font.BOLD, 15));

        add(tusvuelos);

        BOGOTA= new JLabel(" ");

        BOGOTA.setBounds(200,125,450,30);
        add(BOGOTA);


        
        proximovuelos= new JLabel("   Vuelos Disponibles  ");
        proximovuelos.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
    
        proximovuelos.setBounds(0, 305, 732, 40);
        proximovuelos.setFont(new Font("arial", Font.BOLD, 15));
        proximovuelos.setForeground(Color.blue);
        add(proximovuelos);
        
        this.setTitle("Aereolinea.app");


        
    }




/* (non-Javadoc)
 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
 */
@Override
public void actionPerformed(ActionEvent e) {
    // 
    if(e.getSource()==VUELOS){
        BOGOTA.setText("BOGOTA A CALI ");
        JOptionPane.showMessageDialog(null,"VUELO reservado costo $ 190000");
    }

    if(e.getSource()==VUELOS1){
        BOGOTA.setText("BOGOTA - MEDELLIN");
        JOptionPane.showMessageDialog(null,"VUELO reservado costo $ 165000");
    }

    if(e.getSource()==VUELOS2){
        BOGOTA.setText("BOGOTA - MANIZALES");
        JOptionPane.showMessageDialog(null,"VUELO reservado costo $ 135000");
    }


    if(e.getSource()==VUELOS3){
        BOGOTA.setText("MANIZALES - BOGOTÁ");
        JOptionPane.showMessageDialog(null,"VUELO reservado costo  $ 135000");
    }

    if(e.getSource()==VUELOS4){
        BOGOTA.setText("CALI-BOGOTA");
        JOptionPane.showMessageDialog(null,"VUELO reservado costo $ 190000");
    }
    if(e.getSource()==VUELOS5){
        BOGOTA.setText("MEDELLIN-BOGOTA");
        JOptionPane.showMessageDialog(null,"VUELO reservado costo $ 165000");
    }
    


}

}