import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.TextArea;
import java.util.Scanner;
import java.awt.GridLayout;
import java.util.*;

public class User_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int age = 0;
		String gender = ""; 
		String race = "";
		String smoke = "";
		String yellow_finger = "";
		String anxiety = "";
		String peer_pressure = "";
		String chronic_disease = "";
		String fatigue = "";
		String allergy = "";
		String wheezing = "";
		String alcohol = "";
		String coughing = "";
		String shortness_of_breath = "";
		String swallowing_difficulty = "";
		String chest_pain = "";
		
		gender = genderValidation(gender);
		race = Race(race);
		smoke = Smoke(smoke);
		yellow_finger = YellowFinger(yellow_finger);
		anxiety = Anxiety(anxiety);
		peer_pressure = PeerPressure(peer_pressure);
		chronic_disease = Chronic(chronic_disease);
		fatigue = Fatigue(fatigue);
		allergy = Allergy(allergy);
		wheezing = Wheezing(wheezing); 
		alcohol = Alcohol(alcohol);
		coughing = Coughing(coughing);
		shortness_of_breath = ShortnessOfBreath(shortness_of_breath);
		swallowing_difficulty = SwallowingDifficulty(swallowing_difficulty);
		chest_pain = ChestPain(chest_pain); 
		
		System.out.print("Please enter your age: ");
		age = input.nextInt();
		
		JFrame frame = new JFrame();
		frame.setSize(500,500);//width, height); 
		frame.setLocation(120,0);//x, y); 
		frame.setTitle("SPELLING BEEHIVE");
		frame.setLayout(new GridLayout(1,2)); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 
		
		TextArea left = new TextArea();
		left.setEditable(false);
		frame.getContentPane().add(left);
		
		TextArea right = new TextArea();
		left.setEditable(false);
		frame.getContentPane().add(right);
		
		left.append("Age: " + "\n" + "Gender: " + "\n" + "Race: " + "\n" + "Smoke: " + "\n" + "Yellow__Finger: " + "\n" + "Anxiety " +  "\n"+ "Peer_Presure: " +  "\n" + "Chronic_Disease: " +  "\n" + "Fatigue: " +  "\n" + "Allergy: " + "\n" + "Wheezing: " + "\n" + "Alcohol: " +  "\n" + "Coughing: " + "\n" + "Shrtness_of_Breath: " +  "\n" + "Swallowing_Difficulty: "  + "\n" + "Chest_Pain: ");
		right.append(age + "\n" + gender + "\n"  + race + "\n" + smoke + "\n" + yellow_finger + "\n" + anxiety + "\n" + peer_pressure + "\n" + chronic_disease + "\n" + fatigue + "\n" + allergy + "\n" + wheezing + "\n" + alcohol + "\n" + coughing + "\n" + shortness_of_breath + "\n" + swallowing_difficulty + "\n" + chest_pain);
	}
	
	public static String genderValidation(String g) // This is here to validate the gender
	{
		Scanner input = new Scanner(System.in);
		while(!g.equalsIgnoreCase("M") && !g.equalsIgnoreCase("F"))
		{
			System.out.print("Please enter either M or F for your gender: ");
			g = input.nextLine().toUpperCase();		
		}
		
		return g;
	}
	
	public static String Smoke(String a)
	{
		Scanner input = new Scanner(System.in);
		while(!a.equalsIgnoreCase("YES") && !a.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you smoke? Please enter a yes or a no: ");
			a = input.nextLine().toUpperCase();		
		}
		
		return a;
		
	}
	
	public static String Race(String z)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your race: ");
		z = input.nextLine().toUpperCase();		

		return z;
	}
	
	public static String YellowFinger(String b)
	{
		Scanner input = new Scanner(System.in);
		while(!b.equalsIgnoreCase("YES") && !b.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you have yellow_finger? Please enter a yes or a no: ");
			b = input.nextLine().toUpperCase();		
		}
		
		return b;
	}
	
	
	public static String Anxiety(String c)
	{
		Scanner input = new Scanner(System.in);
		while(!c.equalsIgnoreCase("YES") && !c.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you have anxiety? Please enter a yes or a no: ");
			c = input.nextLine().toUpperCase();		
		}
		return c;
	}
	
	
	public static String PeerPressure(String d)
	{
		Scanner input = new Scanner(System.in);
		while(!d.equalsIgnoreCase("YES") && !d.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you get peer pressure? Please enter a yes or a no: ");
			d = input.nextLine().toUpperCase();		
		}
		return d;
	}
	
	public static String Chronic(String e)
	{
		Scanner input = new Scanner(System.in);
		while(!e.equalsIgnoreCase("YES") && !e.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you have chronic diseases? Please enter a yes or a no: ");
			e = input.nextLine().toUpperCase();		
		}
		return e;
		
	}
	
	public static String Fatigue(String f)
	{
		Scanner input = new Scanner(System.in);
		while(!f.equalsIgnoreCase("YES") && !f.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you often feel fatigue? Please enter a yes or a no: ");
			f = input.nextLine().toUpperCase();		
		}
		return f;
	}
	
	public static String Allergy(String h)
	{
		Scanner input = new Scanner(System.in);
		while(!h.equalsIgnoreCase("YES") && !h.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you have allergy? Please enter a yes or a no: ");
			h = input.nextLine().toUpperCase();		
		}
		return h;
	}
	
	public static String Wheezing(String i)
	{
		Scanner input = new Scanner(System.in);
		while(!i.equalsIgnoreCase("YES") && !i.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you often wheez? Please enter a yes or a no: ");
			i = input.nextLine().toUpperCase();		
		}
		return i;
		
	}
	
	public static String Alcohol(String j)
	{
		Scanner input = new Scanner(System.in);
		while(!j.equalsIgnoreCase("YES") && !j.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you often drink? Please enter a yes or a no: ");
			j = input.nextLine().toUpperCase();		
		}
		return j;
	}
	
	public static String Coughing(String k)
	{
		Scanner input = new Scanner(System.in);
		while(!k.equalsIgnoreCase("YES") && !k.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you often cough? Please enter a yes or a no: ");
			k = input.nextLine().toUpperCase();		
		}
		return k;
	}
	
	public static String ShortnessOfBreath(String l)
	{
		Scanner input = new Scanner(System.in);
		while(!l.equalsIgnoreCase("YES") && !l.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you often feel shortness of breath? Please enter a yes or a no: ");
			l = input.nextLine().toUpperCase();		
		}
		return l;
	}
	
	public static String SwallowingDifficulty(String m)
	{
		Scanner input = new Scanner(System.in);
		while(!m.equalsIgnoreCase("YES") && !m.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you have swallowing difficulty? Please enter a yes or a no: ");
			m = input.nextLine().toUpperCase();		
		}
		return m;
	}
	
	public static String ChestPain(String n)
	{
		Scanner input = new Scanner(System.in);
		while(!n.equalsIgnoreCase("YES") && !n.equalsIgnoreCase("NO"))
		{
			System.out.print("Do you feel chest pain? Please enter a yes or a no: ");
			n = input.nextLine().toUpperCase();		
		}
		return n;
	}
	

}
