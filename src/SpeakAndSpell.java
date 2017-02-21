
	import javax.swing.JOptionPane;

	/**
	 * Teacher's Note: 
	 * Have the kids play with the Speak & Spell. 
	 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
	 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
	 * Discuss with students how you would make this program. 
	 * Allow them to code it themselves, or use this recipe.
	 **/

	public class SpeakAndSpell {

		public static void main(String[] args) {
			// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
     speak("spell mandlebrot ");
			// 2. Catch the user's answer in a String
String word = JOptionPane.showInputDialog(".....");
			// 3. If the user spelled the word correctly, speak "correct"
if(word .equals("mandlebrot")){
speak("correct ");}
			// 4. Otherwise say "wrong"
else{
	speak("WRONG");
}
			// 5. repeat the process for other words
			speak("spell pneumonoultramicroscopicsilicovolcanoconiosis");
		
			String longs = JOptionPane.showInputDialog(".....");
		
			if(longs .equals("pneumonoultramicroscopicsilicovolcanoconiosis")){
				speak("correct ");}
			else{
				speak("WRONG");
			}
			speak("spell supercalifragilisticexpialidocious");
			
			String longie = JOptionPane.showInputDialog(".....");
		
			if(longie .equals("supercalifragilisticexpialidocious")){
				speak("correct ");}
			else{
				speak("WRONG");
			}
speak("spell rindfleischetikettierungsueberwachungsaufgabenuebertragungsgesetz ");
			
			String longer = JOptionPane.showInputDialog(".....");
		
			if(longer .equals("rindfleischetikettierungsueberwachungsaufgabenuebertragungsgesetz")){
				speak("correct ");}
			else{
				speak("WRONG");
			}
			
speak("spell Zhōnghuá rénmín gònghéguó xīnjiāng wéiwú'ěr zìzhìqū yīlí hāsàkè zìzhìzhōu chá bù chá ěr xíbó zú zìzhìxiàn ào yī yà yī lākè xiāng ào yī yà yī lākè cūn cūnmín wěiyuánhuì gǔ qiě mò guó lìshǐ wénhuà yízhǐ shēnbào liánhéguó jiàoyù kēxué wénhuà zǔzhī shìjiè fēi wùzhí wénhuà yíchǎn gōngzuò lǐngdǎo xiǎozǔ bàngōngshì ");
			
			String longerie = JOptionPane.showInputDialog(".....");
		
			if(longerie .equals("Zhōnghuá rénmín gònghéguó xīnjiāng wéiwú'ěr zìzhìqū yīlí hāsàkè zìzhìzhōu chá bù chá ěr xíbó zú zìzhìxiàn ào yī yà yī lākè xiāng ào yī yà yī lākè cūn cūnmín wěiyuánhuì gǔ qiě mò guó lìshǐ wénhuà yízhǐ shēnbào liánhéguó jiàoyù kēxué wénhuà zǔzhī shìjiè fēi wùzhí wénhuà yíchǎn gōngzuò lǐngdǎo xiǎozǔ bàngōngshì")){
				speak("correct ");}
			else{
				speak("WRONG");
			}
		}
		

		static void speak(String words) {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}




