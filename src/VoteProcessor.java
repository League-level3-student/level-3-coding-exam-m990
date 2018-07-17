import java.util.ArrayList;

public class VoteProcessor {
	public String calculateElectionWinner(ArrayList<String> votes) {
		int edwardSnowden = 0;
		int popeFrancis = 0;
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equalsIgnoreCase("Edward Snowden")) {
				edwardSnowden++;
			}
			else if (votes.get(i).equalsIgnoreCase("Pope Francis")){
				popeFrancis++;
			}
		}
		if (edwardSnowden > popeFrancis) {
			return "edward snowden";
		}
		else if (popeFrancis > edwardSnowden) {
			return "pope francis";
		}
		else {
			return "TIE";
		}
	}
}
