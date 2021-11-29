package demo;

public class Cricketscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]scores={281, 344, 265, 272, 236, 324, 287};
int sum=0;
int count = 0;
int length=scores.length;
for(int i=0;i<length;i++){
	sum=sum+scores[i];
}
float average=(sum/length);
	int i=0;
	if(scores[i]<average){
		count=count+1;
	}
	else if(scores[i]>average){
		count=count+1;
	}
	else {
		count=count+1;
	}
	System.out.println(average);
	System.out.println(count);


}
}----Test comment----