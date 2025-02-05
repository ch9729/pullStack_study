package com.secure.notes.services;

import com.secure.notes.models.Note;

import java.util.List;

public interface NoteService {

    // 유저가 새 노트를 만든다.
    Note createNoteForUser(String username, String content);

    // 유저가 id값을 통해 노트를 수정한다.
    Note updateNoteForUser(Long noteId, String content, String username);

    // 유저가 id값을 통해 노트를 삭제한다.
    void deleteNoteForUser(Long noteId, String username);

    // 유저의 모든 노트를 가져온다.
    List<Note> getNotesForUser(String username);
}
