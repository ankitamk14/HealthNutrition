package com.health.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.model.Category;
import com.health.model.User;
import com.health.model.language;
import com.health.model.topic;
import com.health.repository.languagedao;
import com.health.service.languageService;

@Service
public class languageServiceImp implements languageService
{

	@Autowired
	private languagedao languagedao;
	
	
	
	/*
	 * @Transactional public Boolean findByExcludeLanguage(String languageName) {
	 * int lanNames=languagedao.findByExcludeLanguage(languageName);
	 * 
	 * 
	 * if(lanNames >0) { return true;
	 * 
	 * }else { return false; } }
	 */
	
}