/*
 * There  are  N  number  of  student  in  the  class. Each student has three 
 * compulsory   subjects   and 2   additional   subjects.  List of Compulsory 
 * Subjects  are:  Math,  Phy,  Chem.  And  list of  Additional Subjects are: 
 * Bio, Comp, Sports, English.   All the subjects are    tested in 100 marks. 
 * Each student will get  some marks  in  the exam.   So design a java  class
 * or a set of classes  which  could  prepare the result of the class. Result 
 * should be able to answer who are first second   third   all  together? Who 
 * are first second third in a specific subject? Who are   first second third 
 * in a specific subject combination of any number ( like show me top3 having
 * Math and Phy or Math and English and Sports). Give  proper prompt  for the 
 * query.
 */

import java.util.*;
class marks{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int Maths;
	private int Physics;
	private int Chemistry;
	int Biology;
	int CSE;
	int Sports;
	int English;
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
	}
	public int getPhysics() {
		return Physics;
	}
	public void setPhysics(int physics) {
		Physics = physics;
	}
	public int getChemistry() {
		return Chemistry;
	}
	public void setChemistry(int chemistry) {
		Chemistry = chemistry;
	}
	public int getBiology() {
		return Biology;
	}
	public void setBiology(int biology) {
		Biology = biology;
	}
	public int getCSE() {
		return CSE;
	}
	public void setCSE(int cSE) {
		CSE = cSE;
	}
	public int getSports() {
		return Sports;
	}
	public void setSports(int sports) {
		Sports = sports;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
}
public class Class_marks {
	static int get_highest(int arr[]) {
		int max=arr[0],pos=0;
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				pos=i;
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the strength of the class :");
		int n=sc.nextInt();//size of the class array
		marks[] mark=new marks[n];//initializing an array of size 'n'
		int[] phy_max=new int[n];
		int[] maths_max=new int[n];
		int[] chems_max=new int[n];
		int[] bio_max=new int[n];
		int[] sports_max=new int[n];
		int[] eng_max=new int[n];
		int[] cse_max=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("You will be entering details of student number "+(i+1));
			System.out.print("Enter the first name of the student :");
			String name_1=sc.next();
			System.out.print("Enter the last name of the student :");
			String name_2=sc.next();
			//taking arguments as i/p
			System.out.print("Enter marks in Maths :");
			int maths=sc.nextInt();
			System.out.print("Enter marks in Physics :");
			int physics=sc.nextInt();
			System.out.print("Enter marks in Chemistry :");
			int chems=sc.nextInt();
			
			phy_max[i]=physics;
			maths_max[i]=maths;
			chems_max[i]=chems;
			
			//creating object
			mark[i]=new marks();
			
			//passing the name first
			mark[i].setName(name_1+" "+name_2);
			
			//providing marks to compulsory subjects
			mark[i].setMaths(maths);
			mark[i].setPhysics(physics);
			mark[i].setChemistry(chems);
			
			//providing marks to optional subjects
			System.out.print("Enter the first additional subject you want to choose :");
			String subj_1=sc.next();
			
			//code for the first optional subject
			if(subj_1.equals("Biology")) {
				System.out.print("Please enter marks for biology :");
				int biology=sc.nextInt();
				bio_max[i]=biology;
				mark[i].setBiology(biology);
			}
			else if(subj_1.equals("Sports")) {
				System.out.print("Please enter marks for sports :");
				int sports=sc.nextInt();
				sports_max[i]=sports;
				mark[i].setSports(sports);
			}
			else if(subj_1.equals("Computer")) {
				System.out.print("Please enter marks for computer :");
				int cse=sc.nextInt();
				cse_max[i]=cse;
				mark[i].setCSE(cse);
			}
			else if(subj_1.equals("English")) {
				System.out.print("Please enter marks for english :");
				int english=sc.nextInt();
				eng_max[i]=english;
				mark[i].setEnglish(english);
			}
			
			System.out.print("Enter the second additional subject you want to choose :");
			String subj_2=sc.next();
			
			//code for the 2nd optional subject
			if(subj_2.equals("Biology")) {
				System.out.print("Please enter marks for biology :");
				int biology=sc.nextInt();
				bio_max[i]=biology;
				mark[i].setBiology(biology);
			}
			else if(subj_2.equals("Sports")) {
				System.out.print("Please enter marks for sports :");
				int sports=sc.nextInt();
				sports_max[i]=sports;
				mark[i].setSports(sports);
			}
			else if(subj_2.equals("Computer")) {
				System.out.print("Please enter marks for computer :");
				int cse=sc.nextInt();
				cse_max[i]=cse;
				mark[i].setCSE(cse);
			}
			else if(subj_2.equals("English")) {
				System.out.print("Please enter marks for english :");
				int english=sc.nextInt();
				eng_max[i]=english;
				mark[i].setEnglish(english);
			}
		}
		
		//printing everything
		for(int i=0;i<n;i++) {
			System.out.print("Name :"+mark[i].getName()+" | Maths :"+mark[i].getMaths()+" | Physics :"+
			mark[i].getPhysics()+" | Chemistry :"+mark[i].getChemistry());
			if(mark[i].getBiology()!=0) {
				System.out.print(" | Biology :"+mark[i].getBiology());
			}
			if(mark[i].getCSE()!=0) {
				System.out.print(" | Computer :"+mark[i].getCSE());
			}
			if(mark[i].getSports()!=0) {
				System.out.print(" | Sports :"+mark[i].getSports());
			}
			if(mark[i].getEnglish()!=0) {
				System.out.print(" | English :"+mark[i].getEnglish());
			}
			System.out.println();
		}
		
		//code to calculate the first second and third in total
		int[] sum=new int[n];
		for(int i=0;i<n;i++) {
			sum[i]=mark[i].getMaths()+mark[i].getPhysics()+mark[i].getChemistry()+mark[i].getBiology()+mark[i].getCSE()+mark[i].getEnglish()+mark[i].getSports();
		}
		int x,y,z,m,t,o;
		x=get_highest(sum);
		m=sum[x];
		sum[x]=-1;
		y=get_highest(sum);
		t=sum[y];
		sum[y]=-1;
		z=get_highest(sum);
		o=sum[z];
		sum[z]=-1;
		System.out.println("1st in class "+mark[x].getName()+" with "+m+" marks");
		System.out.println("2nd in class "+mark[y].getName()+" with "+t+" marks");
		System.out.println("3rd in class "+mark[z].getName()+" with "+o+" marks");
		
		//code to calculate 1st-2nd-3rd highest in each field
		System.out.print("Enter the field for which you want to see the 1st-2nd-3rd highest marks :");
		String field=sc.next();
		int a,b,c;
		if(field.equals("Physics")) {
		a=get_highest(phy_max);
		phy_max[a]=-1;
		b=get_highest(phy_max);
		phy_max[b]=-1;
		c=get_highest(phy_max);
		phy_max[c]=-1;
		System.out.println(mark[a].getName()+" got the highest in Physics with "+mark[a].getPhysics());
		}
		else if(field.equals("Maths")) {
		a=get_highest(maths_max);
		maths_max[a]=-1;
		b=get_highest(maths_max);
		maths_max[b]=-1;
		c=get_highest(maths_max);
		maths_max[c]=-1;
		System.out.println(mark[a].getName()+" got the highest in Maths with "+mark[a].getMaths());
		}
		else if(field.equals("Chemistry")) {
		a=get_highest(chems_max);
		chems_max[a]=-1;
		b=get_highest(chems_max);
		chems_max[b]=-1;
		c=get_highest(chems_max);
		chems_max[c]=-1;
		System.out.println(mark[a].getName()+" got the highest in Chemistry with "+mark[a].getChemistry());
		}
		else if(field.equals("Biology")) {
		a=get_highest(bio_max);
		bio_max[a]=-1;
		b=get_highest(bio_max);
		bio_max[b]=-1;
		c=get_highest(bio_max);
		bio_max[c]=-1;
		System.out.println(mark[a].getName()+" got the highest in Biology with "+mark[a].getBiology());
		}
		else if(field.equals("Sports")) {
		a=get_highest(sports_max);
		sports_max[a]=-1;
		b=get_highest(sports_max);
		sports_max[b]=-1;
		c=get_highest(sports_max);
		sports_max[c]=-1;
		System.out.println(mark[a].getName()+" got the highest in Sports with "+mark[a].getSports());
		}
		else if(field.equals("Computer")) {
		a=get_highest(cse_max);
		cse_max[a]=-1;
		b=get_highest(cse_max);
		cse_max[b]=-1;
		c=get_highest(cse_max);
		cse_max[c]=-1;
		System.out.println(mark[a].getName()+" got the highest in Computer with "+mark[a].getCSE());
		}
		else if(field.equals("English")) {
		a=get_highest(eng_max);
		eng_max[a]=-1;
		b=get_highest(eng_max);
		eng_max[b]=-1;
		c=get_highest(eng_max);
		eng_max[c]=-1;
		System.out.println(mark[a].getName()+" got the highest in Physics with "+mark[a].getPhysics());
		}
		
		//subject combination
		System.out.print("Enter the subjects, whose combination of 1st-2nd-3rd highest you want to see (Please separate them by a space):");
		String combination="";
		combination+=" "+sc.next();
		combination+=" "+sc.next();
		combination+=" "+sc.next();
		combination+=" "+sc.next();
		combination+=" "+sc.next();
		combination+=" "+sc.next();
		combination+=" "+sc.next();
		System.out.println(combination);
		int[] combination_arr=new int[n];
		if(combination.contains("Physics")) {
			for(int i=0;i<n;i++) {
				combination_arr[i]+=mark[i].getPhysics();
			}
		}
		if(combination.contains("Maths")) {
			for(int i=0;i<n;i++) {
				combination_arr[i]+=mark[i].getMaths();
			}
		}
		if(combination.contains("Chemistry")) {
			for(int i=0;i<n;i++) {
				combination_arr[i]+=mark[i].getChemistry();
			}
		}
		if(combination.contains("Biology")) {
			for(int i=0;i<n;i++) {
				combination_arr[i]+=mark[i].getBiology();
			}
		}
		if(combination.contains("Sports")) {
			for(int i=0;i<n;i++) {
				combination_arr[i]+=mark[i].getSports();
			}
		}
		if(combination.contains("English")) {
			for(int i=0;i<n;i++) {
				combination_arr[i]+=mark[i].getEnglish();
			}
		}
		if(combination.contains("Computer")) {
			for(int i=0;i<n;i++) {
				combination_arr[i]+=mark[i].getCSE();
			}
		}
		x=get_highest(combination_arr);
		m=combination_arr[x];
		combination_arr[x]=-1;
		y=get_highest(combination_arr);
		t=combination_arr[y];
		combination_arr[y]=-1;
		z=get_highest(combination_arr);
		o=combination_arr[z];
		combination_arr[z]=-1;
		sum[z]=-1;
		System.out.println("1st in combination "+mark[x].getName()+" with "+m+" marks");
		System.out.println("2nd in combination "+mark[y].getName()+" with "+t+" marks");
		System.out.println("3rd in combination "+mark[z].getName()+" with "+o+" marks");
		
	}

}
