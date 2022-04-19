package com.controller;

import java.lang.module.FindException;

import javax.print.URIException;
import javax.websocket.DecodeException;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.base64.DecoderException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AdminExceptionController<UpdateAdminException> {

	@ExceptionHandler(DecoderException.class)
	public ResponseEntity<?> handleDeleteException(DecodeException e, WebRequest req) {
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(FindException.class)
	public ResponseEntity<?> handleUpdateException(UpdateAdminException e1, WebRequest req) {
		return new ResponseEntity<>(e1.toString(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(FindException.class)
	public ResponseEntity<?> handleFindException(FindException e2, WebRequest req) {
		return new ResponseEntity<>(e2.toString(),HttpStatus.NOT_FOUND);
	}
}
