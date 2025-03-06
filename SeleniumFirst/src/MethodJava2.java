
public class MethodJava2 {
	
	
	
	public static void main(String[] args) {
		MethodJava2 metho = new MethodJava2();
		metho.deleteVideo("dsgf6df52g");
		metho.deleteVideo(1552);
	}
	private void deleteVideo(String videoId) {
		System.out.println("Video Deleted - " + videoId);}
		
		private void deleteVideo(int videoId) {
			System.out.println("Video Deleted - " + videoId);
	}

	public void createVideo() {
		System.out.println("Video Created");

	}

	private boolean uploadVideo() {
		System.out.println("Video Uploaded");
		return true;

	}
	
	public String shareVideo() {
		return "Facebook";
	}

}
 