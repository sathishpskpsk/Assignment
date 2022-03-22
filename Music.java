package Assignment;

public class Music implements Comparable<Music>  {
	@Override
	public String toString() {
		return "Music [s_Id=" + s_Id + ", s_Title=" + s_Title + ", s_Artist=" + s_Artist + ", s_Album=" + s_Album
				+ ", s_Location=" + s_Location + ", s_Description=" + s_Description + "]";
	}

	private int s_Id;
	private String s_Title;
	private String s_Artist;
	private String s_Album;
	private String s_Location;
	private String s_Description;
	

	public Music() {
		super();
	}
	public Music(int s_Id, String s_Title, String s_Artist, String s_Album, String s_Location, String s_Description) {
		super();
		this.s_Id = s_Id;
		this.s_Title = s_Title;
		this.s_Artist = s_Artist;
		this.s_Album = s_Album;
		this.s_Location = s_Location;
		this.s_Description = s_Description;
	}
	public int getS_Id() {
		return s_Id;
	}
	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}
	public String getS_Title() {
		return s_Title;
	}
	public void setS_Title(String s_Title) {
		this.s_Title = s_Title;
	}
	public String getS_Artist() {
		return s_Artist;
	}
	public void setS_Artist(String s_Artist) {
		this.s_Artist = s_Artist;
	}
	public String getS_Album() {
		return s_Album;
	}
	public void setS_Album(String s_Album) {
		this.s_Album = s_Album;
	}
	public String getS_Location() {
		return s_Location;
	}
	public void setS_Location(String s_Location) {
		this.s_Location = s_Location;
	}
	public String getS_Description() {
		return s_Description;
	}
	public void setS_Description(String s_Description) {
		this.s_Description = s_Description;
	}
	
	@Override
	public int compareTo(Music o) {
		if(this.s_Title.charAt(0)>o.s_Title.charAt(0))
			return 1;
		else if (this.s_Title.charAt(0)<o.s_Title.charAt(0))
			return -1;
		return 0;
	}
	
	

}
