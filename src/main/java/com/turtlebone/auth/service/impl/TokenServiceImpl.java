
package com.turtlebone.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.turtlebone.auth.entity.Token;
import com.turtlebone.auth.repository.TokenRepository;
import com.turtlebone.auth.model.TokenModel;
import com.turtlebone.auth.service.TokenService;
import com.turtlebone.auth.util.BeanCopyUtils;

@Service
public class TokenServiceImpl implements TokenService {

	@Autowired
	private TokenRepository tokenRepo;
	

	/*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return tokenRepo.deleteByPrimaryKey(id);
	}
	

    /*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public TokenModel findByPrimaryKey(Integer id) {
		Token token = tokenRepo.selectByPrimaryKey(id);
		return BeanCopyUtils.map(token, TokenModel.class);
	}
	
	/*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public int updateByPrimaryKey(TokenModel tokenModel) {
		return tokenRepo.updateByPrimaryKey(BeanCopyUtils.map(tokenModel, Token.class));
	}
	
	/*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public int updateByPrimaryKeySelective(TokenModel tokenModel) {
		return tokenRepo.updateByPrimaryKeySelective(BeanCopyUtils.map(tokenModel, Token.class));
	}
	

	/*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public int create(TokenModel tokenModel) {
		return tokenRepo.insert(BeanCopyUtils.map(tokenModel, Token.class));
	}

	/*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public int createSelective(TokenModel tokenModel) {
		return tokenRepo.insertSelective(BeanCopyUtils.map(tokenModel, Token.class));
	}

	/*
	 * @Transactional is not necessarry for the single atomic CRUD statement for better performance, 
	 * but you still have to take care of @Transactional for multi-statements scenario.
	 * if read only,please config as "@Transactional(readOnly = true)",otherwise "@Transactional"
	 */
	@Override
	public int selectCount(TokenModel tokenModel) {
		return tokenRepo.selectCount(BeanCopyUtils.map(tokenModel, Token.class));
	}


	@Override
	public TokenModel selectByTokenId(String tokenId) {
		Token token = tokenRepo.selectByTokenId(tokenId);
		return BeanCopyUtils.map(token, TokenModel.class);
	}



}
