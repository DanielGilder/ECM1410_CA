public class Team{


		private String description;
		private String name;
		private static int count = 0;
		private int teamID;
		Team(String name, String description){
			this.name = name;
			this.description = description;
			setTeamID(++count)
		}
		
		public void setTeamID(int teamID){
		this.teamID = teamIDID;
	     }
		 
		 public int getTeamID(){
			return teamID; 
		 }
}