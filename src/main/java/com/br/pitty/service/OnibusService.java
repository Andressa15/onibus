package com.br.pitty.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.pitty.model.OnibusModel;
import com.br.pitty.model.PessoaModel;

@Service
public class OnibusService {

	List<OnibusModel> listaOnibus = new ArrayList<OnibusModel>(Arrays.asList(new OnibusModel("Shell", "São Paulo", 01.30, 100, 50)));
	List<PessoaModel> listaClientes =  new ArrayList<PessoaModel>(Arrays.asList(new PessoaModel
			("Gessica", "gessiquingaCatinha_@gmail.com", 30, 3)));

	public List<OnibusModel> mostrar(){
		return listaOnibus;
	}

	public String cadastrar(PessoaModel Pessoa)	{

	if(Pessoa.getIdade() >= 18 ){
		listaClientes.add(Pessoa);
		return "redirect:/realizado";
	}else {
		return "redirect:/menorIdade";
	}
}
}