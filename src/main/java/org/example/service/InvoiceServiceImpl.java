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

/**
 * Kelas implementasi dari invoice service
 * @author Dwi Satria Patra
 */
@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService{

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    FilmRepository filmRepository;

    @Autowired
    ScheduleRepository scheduleRepository;

    /**
     * Method untuk mengambil data seat berdasarkan id
     *
     * @param seatNumberCompositeKey parameter untuk composite key dari seat yang dicari
     * @return hasil pencarian seat
     */
    @Override
    public Seat getSeatById(SeatNumberCompositeKey seatNumberCompositeKey) {
        if (seatRepository.findById(seatNumberCompositeKey).isPresent()) {
            return seatRepository.findById(seatNumberCompositeKey).get();
        } else {
            return null;
        }
    }

    /**
     * Method untuk mendapatkan schedule berdasarkan id-nya
     *
     * @param idSchedule parameter untuk id dari schedule yang dimaksud
     * @return objek schedule hasil pencarian berdasarkan id-nya
     */
    @Override
    public Schedule findScheduleById(Long idSchedule) {
        if (scheduleRepository.findById(idSchedule).isPresent()) {
            return scheduleRepository.findById(idSchedule).get();
        } else {
            return null;
        }
    }

    /**
     * Method untuk mendapatkan film berdasarkan id film
     *
     * @param idFilm parameter untuk id dari film
     * @return film hasil pencarian berdasarkan id
     */
    @Override
    public Film getFilmById(Long idFilm) {
        if (filmRepository.findById(idFilm).isPresent()) {
            return filmRepository.findById(idFilm).get();
        } else {
            return null;
        }
    }
}
