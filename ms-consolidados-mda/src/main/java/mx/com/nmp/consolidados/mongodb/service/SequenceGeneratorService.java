package mx.com.nmp.consolidados.mongodb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import mx.com.nmp.consolidados.mongodb.entity.DatabaseSequenceEntity;

import java.util.Objects;

@Repository
public class SequenceGeneratorService {

	@Autowired
	private MongoOperations mongoOperation;

	public long generateSequence(String seqName) {

		Query query = new Query(Criteria.where("_id").is(seqName));

		FindAndModifyOptions options = new FindAndModifyOptions();
		options.returnNew(true);

		DatabaseSequenceEntity counter = mongoOperation.findAndModify(query, new Update().inc("seq", 1), options,
				DatabaseSequenceEntity.class);

		return !Objects.isNull(counter) ? counter.getSeq() : 1;
	}

}