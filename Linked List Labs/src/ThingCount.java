//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class ThingCount implements Comparable
{
	private int count;
	private Object thing;

	public ThingCount()
	{
		thing=null;
		count=0;
	}

	public ThingCount(Object thang, int cnt)
	{
		setCount(cnt);
		setThing(thang);
	}

	public ThingCount(Object thang){
		setThing(thang);
		setCount(1);
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(int cnt)
	{
		count=cnt;
	}

	public void setThing(Object obj)
	{
		thing=obj;
	}

	public Object getThing()
	{
		return thing;
	}

	public boolean equals(Object obj)
	{
		ThingCount other = new ThingCount(obj);
		//System.out.println(other.compareTo(this));
		if(other.compareTo(this)==0){
			return true;
		}
		return false;
	}

	public int compareTo(Object obj)
	{
		//System.out.println(obj+"[]"+thing);
		ThingCount other = (ThingCount)obj;
		if(!other.getThing().equals(this.getThing())){
			return -1;
		}/*else if(other.getCount()-this.getCount()!=0){
		  return other.getCount()-this.getCount();
		}*/
		return 0;
	}

	public String toString()
	{
		return ""+ getThing() + " - " + getCount();
	}
}