package cycling.rescources;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap


public class Race_v2{


	private String name;
	private String description;
	private int raceID;
	private int numberOfStages = 0;
	private static int count = 0;
	

	
	Race_v2(String name, String description){
		this.name  = name;
		this.description = description;
		
		setRaceID(++count)
	}
	
	public void setRaceID(int raceID){
		this.raceID = raceID;
	}
	
	    public int getRaceID() {
          return raceID;
      }
	  
	public int getNoOfStages(){
			return numberOfStages;
	}
	
	
	public int addStage( String stageName, String description, double length, LocalDateTime startTime, StageType type){
			return null;
	}
	public int[] getStages(){

		return null;
	}
	public void getStages(){
		return null;
		
	}
	
	public double stageLength(int stageID){
			return null;
			
	}
	
	public void removeStage(int stageID){
		stages.remove(stageID);
	}
	
	
	public void addClimbToRace(int stageId, Double location, SegmentType type, Double averageGradient,
		
			
		
	}
		}