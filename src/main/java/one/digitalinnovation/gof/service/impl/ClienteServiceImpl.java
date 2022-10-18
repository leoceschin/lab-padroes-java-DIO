package one.digitalinnovation.gof.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deletar(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}
