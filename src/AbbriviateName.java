
public class AbbriviateName {

	public static void main(String[] args) {
		String inputStr = "Raksh Kumar Sharma";
		String outputStr = "";
		String[] split = inputStr.split(" ");
		int index = 0;
		while(index < split.length-1){
			outputStr = outputStr + " " + split[index].charAt(0);
			index++;
		}
		outputStr = outputStr + " " + split[index];
		
		System.out.println(outputStr);
	}
}
