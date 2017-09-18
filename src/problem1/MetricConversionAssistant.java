package problem1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MetricConversionAssistant extends JFrame {

		
	JLabel Mile=new JLabel("Mile");
	JTextField txtMile=new JTextField();
	
	JLabel kilometer=new JLabel("Kilo Meter");
	JTextField txtkm=new JTextField();
	
	JLabel Pound=new JLabel("Pound");
	JTextField txtPound=new JTextField();
	
	JLabel Kilogram=new JLabel("Kilo Gram");
	JTextField txtKg=new JTextField();
	
	JLabel Gallon=new JLabel("Gallon");
	JTextField txtGallon=new JTextField();
	
	JLabel Liters=new JLabel("Liters");
	JTextField txtLiters=new JTextField();
	
	JLabel Fahrenheit=new JLabel("Fahrenheit");
	JTextField txtFr=new JTextField();
	
	JLabel Centigrade=new JLabel("Centigrade.");
	JTextField txtC=new JTextField();
	
	JButton convertBtn=new JButton("Convert");
	
		
	MetricConversionAssistant()
	{
		setTitle("Metric Conversion Assistant");
		setLayout(null);
		setBounds(100,100,470,350);
		
		Mile.setBounds(70, 80, 80, 25);
		add(Mile);
		txtMile.setBounds(140, 80, 80, 25);
		add(txtMile);
		
		kilometer.setBounds(230, 80, 80, 25);
		add(kilometer);
		txtkm.setBounds(310, 80, 80, 22);
		add(txtkm);
		
		Pound.setBounds(70, 110, 80, 25);
		add(Pound);
		txtPound.setBounds(140, 110, 80, 25);
		add(txtPound);
		
		Kilogram.setBounds(230, 110, 80, 22);
		add(Kilogram);
		txtKg.setBounds(310, 110, 80, 25);
		add(txtKg);
		
		Gallon.setBounds(70, 140, 80, 25);
		add(Gallon);
		txtGallon.setBounds(140, 140, 80, 25);
		add(txtGallon);
		
		Liters.setBounds(230, 140, 80, 25);
		add(Liters);
		txtLiters.setBounds(310, 140, 80, 25);
		add(txtLiters);
		
		Fahrenheit.setBounds(70, 170, 80, 25);
		add(Fahrenheit);
		txtFr.setBounds(140, 170, 80, 25);
		add(txtFr);
		
		Centigrade.setBounds(230, 170, 80, 25);
		add(Centigrade);
		txtC.setBounds(310, 170, 80, 25);
		add(txtC);
		
		convertBtn.setBounds(200, 230, 90, 30);
		add(convertBtn);
		
		convertBtn.addActionListener(e->{
			if(txtMile.getText().length()>0)
			{
				txtkm.setText(String.format("%.2f", Double.valueOf(txtMile.getText()) * 1.60934));
			}
			else
			{
				txtkm.setText("");
			}

			if(txtPound.getText().length()>0)
			{
				txtKg.setText(String.format("%.2f", Double.valueOf(txtPound.getText()) * 0.453592));
			}
			else
			{
				txtKg.setText("");
			}
			
			if(txtGallon.getText().length()>0)
			{
					txtLiters.setText(String.format("%.2f", Double.valueOf(txtGallon.getText()) * 3.78541));
			}
			else
			{
				txtLiters.setText("");
			}
		
			if(txtFr.getText().length()>0)
			{
				txtC.setText(String.format("%.2f", (Double.valueOf(txtFr.getText())-32) * 5/9));
			}
			else
			{
				txtC.setText("");
			}
			
		});
	
	}
	
	public static void main(String[] args) {
		MetricConversionAssistant Metric=new MetricConversionAssistant();
		Metric.setVisible(true);

	}

}
