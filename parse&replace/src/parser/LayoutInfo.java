package parser;

import java.util.ArrayList;

public class LayoutInfo {
	private String location;
	private ArrayList<ViewInfo> views;
	private String activity_url;

	public String getLocation() {
		return location;
	}

	public LayoutInfo(String location) {
		this.location = location;
		views = new ArrayList<ViewInfo>();
	}

	public ArrayList<ViewInfo> getViews() {
		return views;
	}

	public void addViews(String _type, String _id) {
		this.views.add(new ViewInfo(_type, _id));
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println(activity_url);
		for (int i = 0; i < views.size(); i++) {
			System.out.println(views.get(i).getType() + " "
					+ views.get(i).getId());
		}
	}

	public void setActivity(String activity) {
		// TODO Auto-generated method stub
		activity_url = activity;

	}

	public String getActivity() {
		// TODO Auto-generated method stub
		return activity_url;

	}

	public int getViewLength() {
		// TODO Auto-generated method stub
		return views.size();
	}

	public ViewInfo getView(int i1) {
		// TODO Auto-generated method stub
		return views.get(i1);
	}

}
