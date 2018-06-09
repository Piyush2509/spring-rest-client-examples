package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by piyush.b.kumar on Jun 9, 2018
 */
public class Billing implements Serializable {

	private static final long serialVersionUID = -4448018068264532737L;

	private Card card;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

}
