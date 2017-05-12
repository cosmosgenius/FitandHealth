package fitandHealth;


import java.util.List;

import repast.simphony.engine.watcher.Watch;
import repast.simphony.engine.watcher.WatcherTriggerSchedule;
import repast.simphony.query.space.grid.GridCell;
import repast.simphony.query.space.grid.GridCellNgh;
import repast.simphony.random.RandomHelper;
import repast.simphony.space.SpatialMath;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.continuous.NdPoint;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.SimUtilities;
public class PotentialAgents {
	private ContinuousSpace<Object> space;
	private Grid<Object> grid;
	private int energy,startingEnergy;
	private boolean invite;
	public PotentialAgents(ContinuousSpace<Object> space, Grid<Object> grid, int energy,boolean invite) {

		this.space = space;
		this.grid = grid;
		this.energy =startingEnergy- energy;
	}
	public ContinuousSpace<Object> getSpace() {
		return space;
	}
	public void setSpace(ContinuousSpace<Object> space) {
		this.space = space;
	}
	public Grid<Object> getGrid() {
		return grid;
	}
	public void setGrid(Grid<Object> grid) {
		this.grid = grid;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getStartingEnergy() {
		return startingEnergy;
	}
	public void setStartingEnergy(int startingEnergy) {
		this.startingEnergy = startingEnergy;
	}
	public boolean isInvite() {
		return invite;
	}
	public void setInvite(boolean invite) {
		this.invite = invite;
	}
	@Watch(watcheeClassName="fitandHealth.Club",watcheeFieldNames="broadcast",query="within_moore 1",whenToTrigger=WatcherTriggerSchedule.IMMEDIATE)
	public void run(){
		//call to invite updation
		//call energy check
	}
	/* this would be called after an energy transformation occurs. to check agent
	 * if potential agent to consumer agent if energy increases more than 3
	 * if energy falls below 3 or deadline of consumer agent stage reaches then   consumer agent-> potential agent
	 * if energy falls less than 1 then agent dies
	 */
	public void energyCheck(){
	
	}
	/*in this energy=energy +0.5 if invite received(max of 6)
	 * energy= energy -0.25 if invite not received(min of 1. if less than 1 then agent is removed)
	 *  */
	public void inviteEnergyUpdation(GridPoint pt) {
		
			
		}
	
	}

