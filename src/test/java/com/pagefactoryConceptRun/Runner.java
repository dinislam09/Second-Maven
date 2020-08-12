package com.pagefactoryConceptRun;



import org.testng.annotations.Test;

import com.pagefactoryConcept.Forumlogin;
import com.pagefactoryConcept.HomePageOsa;
import com.pagefactoryConcept.InterviewPage;

public class Runner extends Browser {
	
	@Test
	public void osaTest() {
		HomePageOsa h=new HomePageOsa(dr);
		h.url();
		h.ClickForumlogin();
		Forumlogin f=new Forumlogin(dr);
		f.InterviewQ();
		f.urlvarify();
		InterviewPage I= new InterviewPage(dr);
	
		
		
		
		
	}
}
