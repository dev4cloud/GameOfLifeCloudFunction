import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ibm.gol.GameConfig;
import com.ibm.gol.GameController;
import com.ibm.gol.Generation;

public class Hello {	
	public static JsonObject main(JsonObject args) {
		
//		JsonElement jsonElement = args.get("parameters");
//		if(jsonElement == null) {
//			throw new IllegalArgumentException("Please pass a URL as parameter");
//		}
//		JsonObject parameters = jsonElement.getAsJsonObject();
		JsonElement jsonElement2 = args.get("URL");
		if(jsonElement2 == null) {
			throw new IllegalArgumentException("Please pass a URL as parameter");
		}
		String URL = jsonElement2.getAsString();
		
		System.out.println(URL);
		
		
		GameConfig game = new GameConfig();
		game.setGridDimensions(4,8);
		game.setAliveCell(1,5);
		game.setAliveCell(2,5);
		game.setAliveCell(2,4);
		GameController controller = new GameController(game);
		Generation gen1 = controller.getFirstGeneration();
		
		JsonObject jsonTree = (JsonObject) new Gson().toJsonTree(gen1);
		jsonTree.addProperty("myURL", URL);
		return jsonTree;
	}

}
