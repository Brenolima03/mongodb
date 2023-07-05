package com.nelioalves.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.domain.Post;
import com.nelioalves.domain.User;
import com.nelioalves.dto.UserDTO;
import com.nelioalves.repository.PostRepository;
import com.nelioalves.repository.UserRepository;
import com.nelioalves.services.exception.ObjectNotFoundException;

@Service
public class PostService {
    
    @Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}