package sn.simplon.carlib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commentaire")
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "commentaire_id")
	private int commentaireId;
	@Column(name = "contenu")
	private String content;
	
	public Comment() {
		//TODO Auto-generated constructor stub
	}

	public Comment(int commentaireId, String content) {
		super();
		this.commentaireId = commentaireId;
		this.content = content;
	}

	public int getCommentaireId() {
		return commentaireId;
	}

	public void setCommentaireId(int commentaireId) {
		this.commentaireId = commentaireId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
