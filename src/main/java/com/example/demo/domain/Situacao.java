package com.example.demo.domain;

public enum Situacao {

	AP("Aprovado"), RP("Reprovado por nota final"), FN("Esta na final"), MT("Matriculado"), RF("Reprovado por faltas");

	private String situacao;

	Situacao(String s) {
		this.situacao = s;
	}

	public String getSituacao() {
		return this.situacao;
	}
}