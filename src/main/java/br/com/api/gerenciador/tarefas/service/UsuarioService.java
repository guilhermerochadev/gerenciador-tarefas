package br.com.api.gerenciador.tarefas.service;

import br.com.api.gerenciador.tarefas.entity.Usuario;
import br.com.api.gerenciador.tarefas.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    public Usuario salvarUsuario(Usuario usuario){
        return this.iUsuarioRepository.save(usuario);
    }
    public Usuario atualizarUsuario(Usuario usuario){
        return this.iUsuarioRepository.save(usuario);
    }
    public void excluirUsuario(Usuario usuario){
       this.iUsuarioRepository.deleteById(usuario.getId());
    }
    public List<Usuario> obtemUsuarios(){
        return this.iUsuarioRepository.findAll();
    }

}
