package cycling;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
package cycling.rescourceS

import java.util.HashMap


public class RaceStage{
	private String stageName;
	private double length;
	private int stageID;
	private StageType type;
	private LocalDateTime startTime;
	private static int count = 0;
	
	HashMap<Integer, Segment> stages = new HashMap<Integer, Segment>();
	
	RaceStage(String stageName, String description, double length, LocalDateTime startTime, StageType type){
		this.stageName = stageName;
		this.description = description;
		this.length = length;
		this.startTime = startTime;
		this.type = type;
		
		setStageID(++count);
		
	}
	
	public void setStageID(int stageID){
		this.stageID = stageID;
	}
	
	public int getStageID(){
			return stageID; 
	}
	
	public double length(){
			return length;
	}
	
	
	public void addClimb(){
		
	}

	
	
}