package parser;

public class ViewInfo {
	private String type;
	private String id;

	public ViewInfo(String _type, String _id) {
		setType(_type);
		setId(_id);
	}

	private void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

}
