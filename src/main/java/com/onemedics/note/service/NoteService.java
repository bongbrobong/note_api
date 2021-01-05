package com.onemedics.note.service;

import com.onemedics.note.repository.AttachmentRepository;
import com.onemedics.note.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoteService {
    private NoteRepository noteRepository;


}
