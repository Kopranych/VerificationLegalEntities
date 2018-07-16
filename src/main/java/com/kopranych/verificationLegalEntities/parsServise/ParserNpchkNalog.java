package com.kopranych.verificationLegalEntities.parsServise;

public interface ParserNpchkNalog {
	Page openPage(String url);

	void clickListContact();

	void fillFieldInn(long inn);
}
