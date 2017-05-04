package com.atmecs.pojo;

public class TechTalk
{
	private int id;
	private String name;
	private String description;
	private String date;
	private String presenter;
	
	public TechTalk()
	{
		this(0,"","","","");
	}

	public TechTalk(int id, String name, String description, String date, String presenter)
	{
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
		this.presenter = presenter;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public String getPresenter()
	{
		return presenter;
	}

	public void setPresenter(String presenter)
	{
		this.presenter = presenter;
	}

	@Override
	public String toString()
	{
		return "TechTalk [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date
				+ ", presenter=" + presenter + "]";
	}
}
