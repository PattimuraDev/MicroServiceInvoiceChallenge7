package org.example.service;

import org.example.model.Film;
import org.example.model.Schedule;
import org.example.model.Seat;
import org.example.model.SeatNumberCompositeKey;
import org.example.repository.FilmRepository;
import org.example.repository.ScheduleRepository;
import org.example.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService{

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    FilmRepository filmRepository;

    @Autowired
    ScheduleRepository scheduleRepository;

    @Override
    public Seat getSeatById(SeatNumberCompositeKey seatNumberCompositeKey) {
        if (seatRepository.findById(seatNumberCompositeKey).isPresent()) {
            return seatRepository.findById(seatNumberCompositeKey).get();
        } else {
            return null;
        }
    }

    @Override
    public Schedule findScheduleById(Long idSchedule) {
        if (scheduleRepository.findById(idSchedule).isPresent()) {
            return scheduleRepository.findById(idSchedule).get();
        } else {
            return null;
        }
    }

    @Override
    public Film getFilmById(Long idFilm) {
        if (filmRepository.findById(idFilm).isPresent()) {
            return filmRepository.findById(idFilm).get();
        } else {
            return null;
        }
    }
}
