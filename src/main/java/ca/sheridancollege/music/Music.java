package ca.sheridancollege.music;

import java.io.Serializable;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Music implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 832178199222283016L;
	
	private String title;
	private String artist;
	private String genre;
	private double runtime;
	
	private String[] genres = {"R&B", "EDM", "Hip-Hop", "KPop", "Classical"};
	
}
