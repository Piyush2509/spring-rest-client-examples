package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by piyush.b.kumar on Jun 9, 2018
 */
public class Job implements Serializable {

	private static final long serialVersionUID = -8733179001517726063L;

	private String title;
	private String company;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

}
