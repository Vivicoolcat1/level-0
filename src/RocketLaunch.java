import java.io.IOException;

public class RocketLaunch {
public static void main(String[] args) throws InterruptedException, IOException {
for (int i = 10; i >0 ; i--) {
	Runtime.getRuntime().exec("say T minus " + i + " seconds").waitFor();
	
}
Runtime.getRuntime().exec("say LIFT OFF!!!").waitFor();	
}
}
