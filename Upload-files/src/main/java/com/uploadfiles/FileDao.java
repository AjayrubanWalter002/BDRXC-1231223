package com.uploadfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileDao {
 @Autowired
 FileRepository fr;
}
