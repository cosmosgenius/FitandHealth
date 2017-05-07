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
	public PotentialAgents(ContinuousSpace<Object> space, Grid<Object> grid, int energy) {

		this.space = space;
		this.grid = grid;
		this.energy =startingEnergy- energy;
	}
	/*@Watch(watcheeClassName="fitandHealth.ConsumerAgent",watcheeFieldNames="moved",query="within_moore 1",whenToTrigger=WatcherTriggerSchedule.IMMEDIATE)
	public void run(){
		GridPoint pt=grid.getLocation(this);
		GridCellNgh<ConsumerAgent> nghCreator=new GridCellNgh<ConsumerAgent> (grid,pt,ConsumerAgent.class,1,1);
		List<GridCell<ConsumerAgent>> gridCells= nghCreator.getNeighborhood(true);
		SimUtilities.shuffle(gridCells, RandomHelper.getUniform());
		GridPoint pointWithLeastZombies=null;
		int minCount=Integer.MAX_VALUE;
		for(GridCell<ConsumerAgent> cell:gridCells){
			if(cell.size()<minCount){
				pointWithLeastZombies=cell.getPoint();
				minCount=cell.size();
			}
		}
		if(energy>0){
			moveTowards(pointWithLeastZombies);
		}
		else{
			energy=startingEnergy;
		}
	  }
	public void moveTowards(GridPoint pt)
	{
		if(!pt.equals(grid.getLocation(this))){
			NdPoint myPoint=space.getLocation(this);
			NdPoint otherPoint=new NdPoint(pt.getX(),pt.getY());
			double angle=SpatialMath.calcAngleFor2DMovement(space, myPoint, otherPoint);
			space.moveByVector(this, 2, angle,0);
			myPoint=space.getLocation(this);
			grid.moveTo(this, (int)myPoint.getX(),(int)myPoint.getY());
			energy--;
	}
	}*/
}
