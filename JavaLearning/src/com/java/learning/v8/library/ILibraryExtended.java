package com.java.learning.v8.library;

import java.util.List;
import java.util.Map;

public interface ILibraryExtended extends ILibrary {

	// LibraryExtended should extend Library and implement ILibraryExtended

	public Map<IAuthor, List<IBook>> getBooksByAuthor();

	public Map<IPublisher, List<IBook>> getBooksByPublisher();

	public Map<IPublisher, List<IAuthor>> getAuthorsForPublisher();

	public Map<IAuthor, List<IPublisher>> getPublishersForAuthor();
}
