package Aerolinea;

/**
 *
 * @author luis ortiz
 */
import javax.swing.JTextField;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
//import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;



public class Aeroli   extends JFrame implements ActionListener, ChangeListener{
    JLabel Etiqueta1, Etiqueta2,etiquetanombre,Direccion,telefono,correo,edad,pesodeequipaje,genero,generom,generof,AVISO;
    JTextField Los_Nombres,telefono1,edad1;
    JTextField Los_Apellidos,direccion1,correo1,pesodeequipaje1;
    JButton Titulo,Borrar,destino1,salir;
    String pan,dire,eda,tel,corre,peso,masculino,femenino;
    JRadioButton m,f;
    int destinf;
    ButtonGroup bg;

    JLabel radio_button,f_radiobutton;
    static JPanel borde;
    JPanel borde2;


    
    /**
     * 
     */
    public Aeroli(){ //constructor

        bg = new ButtonGroup();
        this.setTitle("Aereolinea.app");
        setLayout(null);
        Etiqueta2= new JLabel("Registrarse");
        
        Etiqueta2.setBounds(265,40,200,40);
        Etiqueta2.setFont(new Font("impact", Font.BOLD, 36));
        Etiqueta2.setForeground(Color.white);
        
        add(Etiqueta2);
        //nombres e input
        Etiqueta1=new JLabel("Nombre completo  ");
        Etiqueta1.setBounds(20,95,120,30);;
        Etiqueta1.setFont(new Font("Tahoma", Font.BOLD, 12));
        add(Etiqueta1);

        Los_Nombres=new JTextField();
            Los_Nombres.setBounds(140, 95, 200, 30);
        add(Los_Nombres);

        //Direccion e input
        Direccion=new JLabel("Direccion ");
        Direccion.setBounds(400,95,120,30);;
        Direccion.setFont(new Font("Tahoma", Font.BOLD, 12));

        add(Direccion);

        direccion1= new JTextField();
        direccion1.setBounds(470, 95, 200, 30);
        add(direccion1);

    
        //telefono=new JLabel("Telefono")
        telefono=new JLabel("Telefono ");
        telefono.setBounds(34,160,120,30);;
        telefono.setFont(new Font("Tahoma", Font.BOLD, 12));
        add(telefono);

        telefono1= new JTextField();
        telefono1.setBounds(140, 160, 200, 30);
        add(telefono1);

        //correo electronico
        correo=new JLabel("Correo");
        correo.setBounds(400,160,120,30);;
        correo.setFont(new Font("Tahoma", Font.BOLD, 12));
        add(correo);

        correo1= new JTextField();
        correo1.setBounds(470,160, 200, 30);
        add(correo1);

        //edad

        edad=new JLabel("Edad");
        edad.setBounds(39,210,120,30);;
        edad.setFont(new Font("Tahoma", Font.BOLD, 12));
        add(edad);

        edad1= new JTextField();
        edad1.setBounds(140, 210, 200, 30);
        add(edad1);

        //peso de equipaje

        pesodeequipaje=new JLabel("Peso de equipaje");
        pesodeequipaje.setBounds(380,215,120,30);;
        pesodeequipaje.setFont(new Font("Tahoma", Font.BOLD, 12));
        add(pesodeequipaje);

        pesodeequipaje1= new JTextField();
        pesodeequipaje1.setBounds(500, 215, 30, 30);
        add(pesodeequipaje1);


        //genero

        genero=new JLabel("Genero");
        genero.setBounds(550,215,120,30);;
        genero.setFont(new Font("Tahoma", Font.BOLD, 12));
        add(genero);

        generom=new JLabel("M");
        generom.setBounds(610, 200, 100, 30);;
        add(generom);

        m= new JRadioButton();
        m.setBounds(625, 199, 20, 15);
        m.addChangeListener(this);
        bg.add(m);
        add(m);

        radio_button= new JLabel(" ");
        f_radiobutton= new JLabel("");
        
        generof=new JLabel("f");
        generof.setBounds(613, 220, 100, 30);;
        add(generof);
        f= new JRadioButton();
        f.setBounds(625, 220, 20, 15);
        f.addChangeListener(this);
        add(f);
        bg.add(f);
        //BUTTON
        
        Titulo = new JButton("Enviar");
        Titulo.setBounds(200, 355, 150, 30);
        add(Titulo);
        Titulo.addActionListener(this);
        Borrar = new JButton(" Borrar ");
        Borrar.setBounds(380, 355, 150, 30);
        add(Borrar);
        Borrar.addActionListener(this);
        salir=new JButton("SALIR");
        salir.setBounds(575, 395, 100, 30);
        add(salir);
        salir.addActionListener(this);
        AVISO =new JLabel("");
        add(AVISO);
        AVISO.setBounds(120,255,250,30);;
        AVISO.setForeground(Color.red);
        //System.out.println(masculino.length());
        //System.out.println(Los_Nombres);
    
    }

    public void actionPerformed(ActionEvent e) {

        
        if(e.getSource()==Titulo){;
           // int exceso= Integer.parseInt(pesodeequipaje1.getText());
           pan=(Los_Nombres.getText());
           dire=direccion1.getText();
           tel=telefono1.getText();
           corre=correo1.getText();
           eda=edad1.getText();
           masculino=radio_button.getText();
           femenino=f_radiobutton.getText();
           peso=pesodeequipaje1.getText();

            if  (pan.length()>2 && dire.length() >2 && tel.length()>2 && corre.length()>2 && eda.length()>0  && peso.length()>1   &&  femenino.length()>1 ){
            
                segundaparte dato1 = new segundaparte(pan,dire,tel,corre,eda,peso,masculino,femenino);
            
                dato1.setBounds(430,319,750,500);
                dato1.setVisible(true);
                borde2= new JPanel();
                borde2.setSize(732,452);
                borde2.setBackground(Color.LIGHT_GRAY);
                
                dato1.getContentPane().add(borde2);
                borde2.setBorder(BorderFactory.createLineBorder(Color.black));
                //dato1.setLocationRelativeTo(null);
                this.setVisible(false);
            }else if (pan.length()>2 && dire.length() >2 && tel.length()>2 && corre.length()>2 && eda.length()>0  && peso.length()>1   &&  masculino.length()>1){
                segundaparte dato1 = new segundaparte(pan,dire,tel,corre,eda,peso,masculino,femenino);
            
                dato1.setBounds(430,319,750,500);
                dato1.setVisible(true);
                borde2= new JPanel();
                borde2.setSize(732,452);
                borde2.setBackground(Color.LIGHT_GRAY);
                System.out.println("hola");
                dato1.getContentPane().add(borde2);
                borde2.setBorder(BorderFactory.createLineBorder(Color.black));
            
                this.setVisible(false);
            }
            
            
            else{  
                AVISO.setText("Ingresa datos Completos");
                //System.out.println(masculino.length());

            }}
        
        if(e.getSource()==salir){
            System.exit(0);

        }

        if(e.getSource()==Borrar){
        pesodeequipaje1.setText("");
        Los_Nombres.setText("");
        direccion1.setText("");
        telefono1.setText("");
        correo1.setText("");
        edad1.setText("");
        AVISO.setText("");
        bg.clearSelection();
    
        }
       
    
        
        
    }

    public void stateChanged(ChangeEvent o){
        if(m.isSelected()){
            radio_button.setText("Masculino");

        }else if (f.isSelected()){
            f_radiobutton.setText("femenino");
    }
}


    public static void main(String[] args) {
        Aeroli formulario=new Aeroli(); 
        formulario.setBounds(20,20,750,500);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario.setLocationRelativeTo(null);
        borde= new JPanel();
        borde.setSize(732,452);
        borde.setBackground(Color.LIGHT_GRAY);
        borde.setBorder(BorderFactory.createLineBorder(Color.black));
        formulario.getContentPane().add(borde);
    }
}


