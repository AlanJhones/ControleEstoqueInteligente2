package br.com.estoqueinteligente.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.jboss.crypto.CryptoUtil;

public class Utilitario {

	public static String gerarSenhaSHA(String senha) {
		return CryptoUtil.createPasswordHash("SHA-256",
				CryptoUtil.BASE64_ENCODING, null, null, senha);
	}

	public static boolean isSenha(String senha, String senhaSHA) {
		MessageDigest algorithm = null;
		try {
			algorithm = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte messageDigestSenha[] = null;
		try {
			messageDigestSenha = algorithm.digest(senha.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuilder hexStringSenha = new StringBuilder();
		for (byte b : messageDigestSenha) {
			hexStringSenha.append(String.format("%02X", 0xFF & b));
		}
		return senhaSHA.toString().equals(hexStringSenha.toString());
	}

}
